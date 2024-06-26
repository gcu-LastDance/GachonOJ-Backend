package com.gachonoj.problemservice.controller;

import com.gachonoj.problemservice.common.response.CommonResponseDto;
import com.gachonoj.problemservice.domain.dto.request.ExamRequestDto;
import com.gachonoj.problemservice.domain.dto.request.ProblemRequestDto;
import com.gachonoj.problemservice.domain.dto.response.*;
import com.gachonoj.problemservice.service.ExamService;
import com.gachonoj.problemservice.service.ProblemService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Lombok 어노테이션 - 코드 간결하게 작성
@Slf4j  // Slf4j를 이용한 간편 로깅
@RestController // Restful 웹 서비스 컨트롤러
@RequiredArgsConstructor    // 필수 final 필드 주입 생성자 생성
@RequestMapping("/problem")   // 이 컨트롤러의 모든 메서드에 대한 기본 경로
public class ProblemController {
    private final ProblemService problemService;    // 주입된 ProblemService 의존성
    private final ExamService examService;

    // 시험 등록
    @PostMapping("/exam/register")
    public ResponseEntity<CommonResponseDto<Void>> registerExam(@RequestBody ExamRequestDto examDto, HttpServletRequest request) {
        Long memberId = Long.parseLong(request.getHeader("X-Authorization-Id"));
        examService.registerExam(examDto, memberId);
        return ResponseEntity.ok(CommonResponseDto.success());
    }

    // 시험 수정
    @PutMapping("/exam/{examId}")
    public ResponseEntity<CommonResponseDto<Void>> updateExam(@PathVariable Long examId, @RequestBody ExamRequestDto request, HttpServletRequest httpRequest) {
        Long memberId = Long.parseLong(httpRequest.getHeader("X-Authorization-Id"));
        examService.updateExam(examId, memberId, request);
        return ResponseEntity.ok(CommonResponseDto.success());
    }

    // 시험 문제 조회
    @GetMapping("/exam/{examId}")
    public ResponseEntity<CommonResponseDto<ExamDetailResponseDto>> getExamDetail(@PathVariable Long examId) {
        ExamDetailResponseDto examDetail = examService.getExamDetail(examId);
        return ResponseEntity.ok(CommonResponseDto.success(examDetail));  // 성공 응답
    }

    // 시험 삭제
    @DeleteMapping("/exam/{examId}")
    public ResponseEntity<CommonResponseDto<Void>> deleteExam(@PathVariable Long examId, HttpServletRequest request) {
        Long memberId = Long.parseLong(request.getHeader("X-Authorization-Id"));
        examService.deleteExam(examId, memberId);
        return ResponseEntity.ok(CommonResponseDto.success());
    }
    // 시험 삭제 admin
    @DeleteMapping("/admin/exam/{examId}")
    public ResponseEntity<CommonResponseDto<Void>> deleteExamByAdmin(@PathVariable Long examId) {
        examService.deleteExamByAdmin(examId);
        return ResponseEntity.ok(CommonResponseDto.success());
    }
    // 알고리즘 문제 등록
    @PostMapping("/admin/register")
    public ResponseEntity<CommonResponseDto<Void>> registerProblem(@RequestBody ProblemRequestDto problemRequestDto) {
        problemService.registerProblem(problemRequestDto);
        return ResponseEntity.ok(CommonResponseDto.success());
    }

    // 알고리즘 문제 수정
    @PutMapping("/admin/register/{problemId}")
    public ResponseEntity<CommonResponseDto<Void>> updateProblem(@PathVariable Long problemId, @RequestBody ProblemRequestDto problemRequestDto) {
        problemService.updateProblem(problemId, problemRequestDto);
        return ResponseEntity.ok(CommonResponseDto.success());
    }

    // 알고리즘 문제 삭제
    @DeleteMapping("/admin/{problemId}")
    public ResponseEntity<CommonResponseDto<Void>> deleteProblem(@PathVariable Long problemId) {
        problemService.deleteProblem(problemId);
        return ResponseEntity.ok(CommonResponseDto.success());
    }

    // 북마크 등록
    @PostMapping("/bookmark/{problemId}")
    public ResponseEntity<CommonResponseDto<Void>> addBookmark(@PathVariable Long problemId, HttpServletRequest request){
        Long memberId = Long.parseLong(request.getHeader("X-Authorization-Id"));
        problemService.addBookmark(memberId, problemId);
        return ResponseEntity.ok(CommonResponseDto.success());
    }

    // 북마크 삭제
    @DeleteMapping("/bookmark/{problemId}")
    public ResponseEntity<CommonResponseDto<Void>> removeBookmark(@PathVariable Long problemId, HttpServletRequest request) {
        Long memberId = Long.parseLong(request.getHeader("X-Authorization-Id"));
        problemService.removeBookmark(memberId, problemId);
        return ResponseEntity.ok(CommonResponseDto.success());
    }

    // 참가예정 대회 & 시험 조회
    // 지난 대회 & 시험 조회
        @GetMapping("/exam/list")
        public ResponseEntity<CommonResponseDto<List<ExamCardInfoResponseDto>>> getExamList(HttpServletRequest request,
                                                                                            @RequestParam String type,
                                                                                            @RequestParam String status) {
            Long memberId = Long.parseLong(request.getHeader("X-Authorization-Id"));
            List<ExamCardInfoResponseDto> result = examService.getExamList(memberId, type, status);
            return ResponseEntity.ok(CommonResponseDto.success(result));
        }

    // 시험 조회 (응시 완료 여부 포함)
    @GetMapping("/test/lists")
    public ResponseEntity<CommonResponseDto<List<TestOverviewResponseDto>>> getMemberTests(HttpServletRequest request,
                                                                                           @RequestParam String type,
                                                                                           @RequestParam String status
    ) {
        Long memberId = Long.parseLong(request.getHeader("X-Authorization-Id"));
        List<TestOverviewResponseDto> exams = examService.getMemberTestList(memberId, type, status);
        return ResponseEntity.ok(CommonResponseDto.success(exams)); // 성공적으로 데이터를 조회했다면 데이터와 함께 응답
    }

    // 문제 목록 조회
    @GetMapping("/problems/list")
    public ResponseEntity<CommonResponseDto<Page<ProblemListResponseDto>>> getProblemList(@RequestParam(required = false,defaultValue = "1") int pageNo,
                                                                                          @RequestParam(required = false) String search,
                                                                                          @RequestParam(required = false) String classType,
                                                                                          @RequestParam(required = false) Integer diff,
                                                                                          @RequestParam(required = false) String sortType) {
        Page<ProblemListResponseDto> result = problemService.getProblemList(pageNo, search, classType, diff, sortType);
        return ResponseEntity.ok(CommonResponseDto.success(result));
    }
    // 추천 알고리즘 문제 조회
    @GetMapping("/problem/recommend")
    public ResponseEntity<CommonResponseDto<List<RecommendProblemResponseDto>>> getRecommendProblems() {
        List<RecommendProblemResponseDto> result = problemService.getRecommenedProblemList();
        return ResponseEntity.ok(CommonResponseDto.success(result));
    }
    // 교수님 시험 목록 조회
    @GetMapping("/exam/professor/list")
    public ResponseEntity<CommonResponseDto<Page<ProfessorExamListResponseDto>>> getProfessorExamList(@RequestParam(required = false,defaultValue = "1") int pageNo,
                                                                                                      HttpServletRequest request) {
        Long memberId = Long.parseLong(request.getHeader("X-Authorization-Id"));
        Page<ProfessorExamListResponseDto> result = examService.getProfessorExamList(memberId, pageNo);
        return ResponseEntity.ok(CommonResponseDto.success(result));
    }
    // 관리자 시험 또는 대회 목록 조회
    @GetMapping("/admin/exam/list")
    public ResponseEntity<CommonResponseDto<Page<ExamOrContestListResponseDto>>> getExamOrContestList(@RequestParam(required = false,defaultValue = "1") int pageNo,
                                                                                                      @RequestParam String type) {
        Page<ExamOrContestListResponseDto> result = examService.getExamOrContestList(pageNo,type);
        return ResponseEntity.ok(CommonResponseDto.success(result));
    }
    // 관리자 문제 목록 조회
    @GetMapping("/admin/problems/list")
    public ResponseEntity<CommonResponseDto<Page<ProblemListByAdminResponseDto>>> getProblemListByAdmin(@RequestParam(required = false,defaultValue = "1") int pageNo,
                                                                                                        @RequestParam(required = false) String search) {
        Page<ProblemListByAdminResponseDto> result = problemService.getProblemListByAdmin(pageNo,search);
        return ResponseEntity.ok(CommonResponseDto.success(result));
    }
    // 사용자 문제 목록 조회
    @GetMapping("/problems/list/member")
    public ResponseEntity<CommonResponseDto<Page<ProblemListResponseDto>>> getProblemListByMember(@RequestParam(required = false,defaultValue = "1") int pageNo,
                                                                                                  @RequestParam(required = false) String type,
                                                                                                  @RequestParam(required = false) String search,
                                                                                                  @RequestParam(required = false) String classType,
                                                                                                  @RequestParam(required = false) Integer diff,
                                                                                                  @RequestParam(required = false) String sortType,
                                                                                                  HttpServletRequest request) {
        Long memberId = Long.parseLong(request.getHeader("X-Authorization-Id"));
        Page<ProblemListResponseDto> result = problemService.getProblemListByMember(type,pageNo, search, classType, diff, sortType, memberId);
        return ResponseEntity.ok(CommonResponseDto.success(result));
    }
    // 문제 응시 화면 문제 상세 조회
    @GetMapping("/problems/{problemId}")
    public ResponseEntity<CommonResponseDto<ProblemDetailResponseDto>> getProblemDetail(@PathVariable Long problemId) {
        ProblemDetailResponseDto result = problemService.getProblemDetail(problemId);
        return ResponseEntity.ok(CommonResponseDto.success(result));
    }

    // 시험 또는 대회 대기 화면
    @GetMapping("/exam/info/{examId}")
    public ResponseEntity<CommonResponseDto<ExamOrContestInfoResponseDto>> getExamOrContestInfo(@PathVariable Long examId,
                                                                                       @RequestParam String type) {
        ExamOrContestInfoResponseDto result = examService.getExamOrContestInfo(examId, type);
        return ResponseEntity.ok(CommonResponseDto.success(result));
    }

    // 문제 수정시 문제 상세 조회
    @GetMapping("/admin/register/{problemId}")
    public ResponseEntity<CommonResponseDto<ProblemDetailAdminResponseDto>> getProblemDetailAdmin(@PathVariable Long problemId) {
        ProblemDetailAdminResponseDto result = problemService.getProblemDetailAdmin(problemId);
        return ResponseEntity.ok(CommonResponseDto.success(result));
    }

    // 시험 결과 목록 조회
    @GetMapping("/exam/{examId}/results")
    public ResponseEntity<CommonResponseDto<ExamResultPageDto>> getExamResultList(
            @PathVariable Long examId,
            @RequestParam(defaultValue = "1") int page) {
        ExamResultPageDto results = examService.getExamResultList(examId, page - 1);
        return ResponseEntity.ok(CommonResponseDto.success(results));
    }
    // 시험 결과 상세 조회
    @GetMapping("/result/{testId}")
    public ResponseEntity<CommonResponseDto<ExamResultDetailsResponseDto>> getExamResults(
            HttpServletRequest request, @PathVariable Long testId) {
        Long memberId = Long.parseLong(request.getHeader("X-Authorization-Id"));
        ExamResultDetailsResponseDto examResult = examService.getExamResults(testId);
        return ResponseEntity.ok(CommonResponseDto.success(examResult));
    }

    // 시험 점수 조회 (학생)
    @GetMapping("/checkscore/{testId}")
    public ResponseEntity<CommonResponseDto<Object>> getTestScore(@PathVariable Long testId) {
        Integer score = examService.getTestScore(testId);
        return ResponseEntity.ok(CommonResponseDto.success(score));
    }

    // 교수 대시보드 진행중인 시험 목록 조회
    @GetMapping("/professor/exam/ongoing")
    public ResponseEntity<CommonResponseDto<List<ExamCardInfoResponseDto>>> getOngoingExam(HttpServletRequest request) {
        Long memberId = Long.parseLong(request.getHeader("X-Authorization-Id"));
        List<ExamCardInfoResponseDto> result = examService.getProfessorExamCardInfo(memberId);
        return ResponseEntity.ok(CommonResponseDto.success(result));
    }

    // 교수 대시보드 오답률 높은 알고리즘 TOP 5
    @GetMapping("/professor/incorrect")
    public ResponseEntity<CommonResponseDto<List<ProblemCardResponseDto>>> getIncorrectProblemList() {
        List<ProblemCardResponseDto> result = problemService.getTop5IncorrectProblem();
        return ResponseEntity.ok(CommonResponseDto.success(result));
    }
    // 시험 응시자 인지 확인 & 시험 시간 맞는지 확인 하기 위한 API
    @GetMapping("/exam/{examId}/enter")
    public ResponseEntity<CommonResponseDto<ExamEnterResponseDto>> getExamEnter(@PathVariable Long examId, HttpServletRequest request) {
        Long memberId = Long.parseLong(request.getHeader("X-Authorization-Id"));
        ExamEnterResponseDto responseDto = examService.checkExamEnter(examId, memberId);
        return ResponseEntity.ok(CommonResponseDto.success(responseDto));
    }

}